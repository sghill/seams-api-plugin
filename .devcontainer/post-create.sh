#!/bin/bash
set -e

sudo chown -R vscode:vscode /home/vscode/.m2
mvn --version
gh --version
