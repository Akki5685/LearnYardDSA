  find-and-upload-folder:
    runs-on: self-hosted
    outputs:
      folder-path: ${{ steps.find-folder.outputs.item }}
    steps:
    - name: Set up Git
      uses: actions/checkout@v2

    - name: Find Latest Test Results Folder
      id: find-folder
      shell: powershell
      run: |
        # Set the target directory
        $target_dir = 'D:\\GitHub Actions Trigger\\GitHub-Actions-Trigger\\TestResults'
        
        # Find the latest folder by LastWriteTime
        $latest_folder = Get-ChildItem -Directory -Path $target_dir | 
                         Sort-Object LastWriteTime -Descending | 
                         Select-Object -First 1
        
        Write-Host "Latest folder: $($latest_folder.FullName)"
        
        # Set the latest folder path as output to be used in the next step
        echo "::set-output name=item::$($latest_folder.FullName)"
    - name: Upload Latest Test Results Folder
      uses: actions/upload-artifact@v3
      with:
        name: latest-test-results-folder
        path: ${{ steps.find-folder.outputs.item }}

    - name: Provide Folder Download Link
      run: |
        echo "You can download the uploaded folder from the Artifacts section of this workflow run."
  find-and-upload-file:
    runs-on: self-hosted
    needs: find-and-upload-folder
    outputs:
      file-path: ${{ steps.find-file.outputs.item }}
    steps:
    - name: Set up Git
      uses: actions/checkout@v2

    - name: Find Latest Test Result File
      id: find-file
      shell: powershell
      run: |
        # Set the target directory
        $target_dir = 'D:\\GitHub Actions Trigger\\GitHub-Actions-Trigger\\Test Result'
        
        # Find the latest file by LastWriteTime
        $latest_file = Get-ChildItem -File -Path $target_dir | 
                        Sort-Object LastWriteTime -Descending | 
                        Select-Object -First 1
        
        Write-Host "Latest file: $($latest_file.FullName)"
        
        # Set the latest file path as output to be used in the next step
        echo "::set-output name=item::$($latest_file.FullName)"
    - name: Upload Latest Test Result File
      uses: actions/upload-artifact@v3
      with:
        name: latest-test-result-file
        path: ${{ steps.find-file.outputs.item }}
