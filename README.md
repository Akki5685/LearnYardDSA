 # Find the latest generated report folder and upload it as an artifact
    - name: Find Latest Report and Upload
      run: |
        # Find the latest modified folder in D:\GATe\artifact
        $latestFolder = Get-ChildItem -Path 'D:\GATe\artifact' | Sort-Object LastWriteTime -Descending | Select-Object -First 1
        echo "Latest folder: $($latestFolder.FullName)"

        # Compress the latest folder (optional step if needed)
        Compress-Archive -Path "$($latestFolder.FullName)\*" -DestinationPath "D:\GATe\artifact\latest-report.zip"
      shell: pwsh

    # Upload the latest folder as an artifact
    - name: Upload Test Report as Artifact
      uses: actions/upload-artifact@v3
      with:
        name: latest-test-report
        path: D:\GATe\artifact\latest-report.zip
