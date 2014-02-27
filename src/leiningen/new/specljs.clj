(ns leiningen.new.specljs
  (:use [leiningen.new.templates :only [renderer name-to-path ->files
                                        sanitize-ns year project-name]]))

(def render (renderer "specljs"))

(defn specljs
  "A project template including speclj and specljs tests."
  [name]
  (let [render (renderer "specljs")
        data {:raw-name name
              :name (project-name name)
              :namespace (sanitize-ns name)
              :nested-dirs (name-to-path name)
              :year (year)}]
    (println "Generating a project called" name "based on the 'specljs' template.")
    (->files data
             ["project.clj" (render "project.clj" data)]
             ["README.md" (render "README.md" data)]
             [".gitignore" (render "gitignore" data)]
             
             ["src/clj/{{nested-dirs}}/core.clj" (render "core.clj" data)]
             ["spec/clj/{{nested-dirs}}/core_spec.clj" (render "spec.clj" data)]

             ["src/cljs/{{nested-dirs}}/core.cljs" (render "core.cljs" data)]
             ["spec/cljs/{{nested-dirs}}/core_spec.cljs" (render "spec.cljs" data)]

             ["bin/speclj" (render "speclj")])))

