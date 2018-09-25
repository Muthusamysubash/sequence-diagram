(ns sequence-diagram.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn functionone
  ""
  []
  (foo "asd"))

(map ns-publics (->> (all-ns)
     (map ns-name)
     (filter #(clojure.string/starts-with? % "sequence-diagram"))))
