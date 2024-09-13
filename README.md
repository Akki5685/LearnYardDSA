 # Find the latest generated report folder and upload it as an artifact
name: Upload Latest Test Report

on:
  push:
    branches:
      - main

jobs:
  upload-latest-report:
    runs-on: ubuntu-latest

    steps:
      # Checkout the repository
      - name: Checkout repository
        uses: actions/checkout@v3

      # Find the latest report folder in the TestResults directory
      - name: Find the latest report folder
        id: find_latest_folder
        run: |
          # Define the TestResults directory path
          REPORT_DIR="${{github.workspace}}/TestResults"

          # Find the most recent folder based on modification time
          LATEST_FOLDER=$(ls -td ${REPORT_DIR}/*/ | head -1)

          # Check if a folder was found
          if [ -z "$LATEST_FOLDER" ]; then
            echo "No report folder found!"
            exit 1
          fi

          # Output the folder path for use in subsequent steps
          echo "Latest report folder: $LATEST_FOLDER"
          echo "::set-output name=latest_report_folder::$LATEST_FOLDER"

      # Upload the latest report folder as an artifact
      - name: Upload report artifact
        uses: actions/upload-artifact@v3
        with:
          name: latest-test-report
          path: ${{ steps.find_latest_folder.outputs.latest_report_folder }}
