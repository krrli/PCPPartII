;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-advanced-reader.ss" "lang")((modname Uebung_Woche6) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #t #t none #f () #f)))
; --------------- Aufgabe 1  ---------------

(define couple (list
(cons "Adam" (cons "Eva" empty))
(cons "Paul" (cons "Paula" empty))))


(define spec-list(list 1(list 2 3(list 5 7)9)))

(define coupleList(list (list "Adam" "Eva")(list "Paul" "Paula")))

; a) (rest (first couple)) = (list ("Eva"))
;    (first (rest couple)) = (list "Paul" "Paula"
;    (rest (rest couple)) = Leere Liste
;    (first (first (rest couple))) = "Paul"
;    (rest (first (rest couple))) = (list "Paula")
;    (cons? (rest (rest couple))) = #false Weil leere Liste
;
; b) (first (rest (first (rest (rest (first (rest spec-list)))))))


; --------------- Aufgabe 2  ---------------
(define (redouble a-list)
  (cond ((empty? a-list) empty)
  (else
   (cons (* 2 (first a-list))
        (redouble (rest a-list))))
))

(define (redouble-with-factor a-list factor)
  (cond ((empty? a-list) empty)
  (else
   (cons (* factor (first a-list))
        (redouble-with-factor (rest a-list) factor)))
))

;(redouble (list 1 2 3))
;(redouble-with-factor (list 1 2 3) 2)
;(redouble-with-factor (list 1 2 3) 5)

; --------------- Aufgabe 3 a) ---------------
(define (f liste)
  (if (empty? liste) empty             ;wenn liste leer ist, gib leer zurück
      (if (empty? (rest liste))(first liste)
                                       ;wenn rest der Liste leer ist, gib den ersten teil der liste zurück
       (f (rest liste))                ;sonst: rekursiver Aufruf mit dem Rest der Liste.
      )
  )
)
; ==> bewirkt, dass immer das letzte Element der Liste zurückgegeben wird

; --------------- Aufgabe 3 b) ---------------
(define (g liste)
  (cond ((empty? liste) empty)                    ;liste leer: gib leer zurück
        ((empty? (rest liste)) (first liste))     ;rest der liste leer: gib das erste Element der Liste zurück
        (else                                     ;sonst:
         (if (> (first liste) (g (rest liste)))   ;wenn der erste Teil der Liste > als (rekursiver Aufruf g mit Rest)
             (first liste)                        ;gib den 1. teil der liste zurück 
             (g (rest liste)))                    ;sonst nochmals rekursiver Aufruf mit dem Rest der Liste
         )
    ))
; ==> bewirkt, dass immer das grösste Element der Liste zurückgegeben wird
; (g (list 5 6 10 3 99))
; (g (list 5 6 10 3))
; (g (list 3000 5 3 2))

; --------------- Aufgabe 4 ---------------
(define (delete item a-list)
  (cond
    ((empty? a-list) empty) ;liste leer: leer zurück
    ((equal? item (first a-list)) (rest a-list)) ;item == erster Teil d. Liste? Rest d. Liste zurück
    (else
     (cons ;zusammenfügen: 
      (first a-list) ;erster Teil der Liste
      (delete item (rest a-list)) ;rekursiver Aufruf mit dem Rest der Liste
      )
     )  
  )
)

;(delete 5 (list 5 1 2 4))
;(delete 3 (list 1 2 3 4))
;(delete 'c '(a b c d))

; --------------- Aufgabe 5 ---------------
(define (contains? item a-list)
  (cond
    ((empty? a-list) #f)
    ((equal? item (first a-list)) #t)
    (else
     (contains? item (rest a-list))
    )
   )
 )

;(contains? 'c '(a b c d))
;(contains? 'f '(a b c d))

; ------- Funktionen höherer Ordnung ------
; --------------- Aufgabe 6 ---------------

(define
  (list-filter rel-op a-list value)
  (cond
    [(empty? a-list) empty]
    [else
     (cond
       [(rel-op (first a-list) value) (cons (first a-list) (list-filter rel-op (rest a-list) value))]
       [else (list-filter rel-op (rest a-list) value)])]
   )
 )

(define my-list (list 3 5 14 6 4 23 6 77 31 30 2))
; (list-filter > my-list 14)
(define my-symbols (list 'a 'b 'c 'y 'x))
(define my-signs (list #t #f 'a 'b))
(define my-strings (list "a" "b" "c" "y" "x"))

; --------------- Aufgabe 6a) ---------------
; 6a) Suche ein bestimmtes Symbol in einer Liste von Symbolen
;(list-filter eq? my-symbols (list 'c))
;(list-filter equal? my-symbols 'u)

; eqv?: identity comparison
; eq?: value comparison (oder equal?)

; --------------- Aufgabe 6b) ---------------
; 6b) Suche ein bestimmtes Zeichen in einer Liste von Zeichen
;(list-filter equal? my-signs #t)
; ====> zeichen in scheme??? (a, b, c) Zeichenketten (hallo) = string

; --------------- Aufgabe 6b) ---------------
; 6c) Suche einen bestimmten String in einer Liste von Strings
;(list-filter equal? my-strings "x")
;(list-filter equal? my-strings "u")


; --------------- Aufgabe 7 ---------------
; Prädikatsfunktion soll untersuchen, ob es eine oder mehrere Zahlen in einer Liste von Zahlen gibt, die teilbar
; durch bestimmte Zahl ist
; Rückgabe: Liste mit Zahlen, die durch X teilbar sind
; Prädikat als Operator in list-filter mitgeben!!!
; division: (remainder X Y) gibt 0, wenn teilbar

(define
  (dividableByX? firstOfTheList x)
  (= 0 (remainder firstOfTheList x))
)
; (list-filter dividableByX? '(1 2 3 4 5 6 7 8 9) 2)
; gibt (list 2 4 6 8)
; (list-filter dividableByX? my-list 5)
; gibt (list 5 30)


; --------------- Aufgabe 8 ---------------
