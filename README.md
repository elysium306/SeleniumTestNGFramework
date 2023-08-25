# Selenium TestNG Framework


### To remove the `remote.origin.url` and `remote.origin.fetch` configurations from your Git repository, you can use the `--unset` option of the `git config` command. Here's how you can do it:

```bash
git config --unset remote.origin.url
git config --unset remote.origin.fetch
```

This will remove the specified configurations from your Git repository.

If you want to remove all configurations related to `remote.origin`, you can use the `--remove-section` option:

```bash
git config --remove-section remote.origin
```

This command will remove the entire `remote.origin` section from your Git configuration.

Please note that these commands will affect the configuration of the repository in your current directory. If you want to modify global Git configuration, you can add the `--global` option to these commands. Always remember to backup your configuration before making such changes.
