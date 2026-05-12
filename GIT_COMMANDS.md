# Git and GitHub Commands

## Initialize a Repository

```bash
git init
```

Creates a new local Git repository.

## Check Repository Status

```bash
git status
```

Shows tracked, untracked, and modified files.

## Stage Files

```bash
git add .
```

Stages all changes for the next commit.

## Commit Changes

```bash
git commit -m "Add CI/CD pipeline project"
```

Saves a snapshot of the staged files.

## Create a Branch

```bash
git branch feature/cicd-workflow
```

Creates a new branch.

## Switch to a Branch

```bash
git checkout feature/cicd-workflow
```

Moves the working tree to the selected branch.

## Create and Switch to a Branch

```bash
git checkout -b feature/cicd-workflow
```

Creates a branch and checks it out immediately.

## Add Remote Repository

```bash
git remote add origin https://github.com/<username>/<repo>.git
```

Connects the local repository to GitHub.

## Push to GitHub

```bash
git push -u origin main
```

Pushes the main branch and sets the upstream tracking branch.

## Push a Feature Branch

```bash
git push -u origin feature/cicd-workflow
```

Uploads the feature branch to GitHub.

## Clone a Repository

```bash
git clone https://github.com/<username>/<repo>.git
```

Copies the repository from GitHub to the local machine.

## Merge Branches

```bash
git checkout main
git merge feature/cicd-workflow
```

Combines changes from one branch into another.