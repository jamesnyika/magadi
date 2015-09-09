;   Copyright (c) James Nyika. All rights reserved.
;   You must not remove this notice, or any other, from this software.
(ns magadi.loaders
    (:require [clojure.data.xml :as x]))

;;Loader for transaction confirmation
(defn load-request
      "This function will load a file with the given name and return data structures"
      [filename]
      (x/parse-str (slurp (str "resources/" filename))))
