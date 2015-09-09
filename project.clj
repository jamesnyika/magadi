(defproject magadi "0.1"
  :description "Undefined for now"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/data.xml "0.0.8"]]
  :source-paths ["src/"]
  :test-paths ["test/"]
  :jvm-opts ^:replace ["-Xmx512m" "-server"]
  :global-vars {*warn-on-reflection* true}
  :main magadi.core
  )
