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

## License

Copyright © 2013 Connor Mendenhall, 2014 Micah Martin

Distributed under the MIT License.
