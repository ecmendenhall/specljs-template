(ns {{name}}.core-spec 
  (:require-macros [specljs.core :refer [describe it should=]])
  (:require [specljs.core]
            [{{name}}.core]))

(describe "A ClojureScript test"
  (it "fails. Fix it!"
    (should= 0 1)))
