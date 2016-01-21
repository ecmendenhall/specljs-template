# specljs-template

A Leiningen template for a ClojureScript project using speclj.

## Usage

    $ lein new specljs <Your project name>

## Verify it worked

`cd` into your new project and run:

    lein cljsbuild once dev

You should see one failing spec.

Files are also created for Clojure code.  You can check these with:

    lein spec

### Note for Windows users:

In order to use specljs on Windows, it is recommended to install PhantomJS through chocolatey:

    choco install phantomjs
    
Change the following lines in `bin/speclj`:

* Line 8: `fs.write("/dev/stdout", x, "w");` to `fs.write("\\\\.\\CON", x, "w");`
* Line 11: `p.injectJs(phantom.args[0]);` to `p.injectJs(sys.args[1]);`


## License

Copyright © 2013 Connor Mendenhall, 2014 Micah Martin

Distributed under the MIT License.
