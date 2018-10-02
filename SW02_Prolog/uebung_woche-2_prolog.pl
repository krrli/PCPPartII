% ------ facts --------
% all females
female(mary). female(liz). female(mia). female(tina). female(ann). female(sue).
% all males
male(mike). male(jack). male(fred). male(tom). male(joe). male(jim).
% all childern of mary
parent(mary, mia). parent(mary, fred). parent(mary, tina).
% all children of mike
parent(mike, mia). parent(mike, fred). parent(mike, tina).
% allchildern of liz
parent(liz, tom). parent(liz, joe).
% all childern of jack
parent(jack, tom). parent(jack, joe).
% all childern of mia
parent(mia, ann).
% all childern of tina
parent(tina, sue). parent(tina, jim).
% all childern of tom
parent(tom, sue). parent(tom, jim).

% ---------------------
% ------ 1a) --------
% Implementieren Sie zwei Pr�dikate mother/2 und father/2. Die Anfrage
% mother(X, tina) soll dann also beispielsweise X = mary zur�ckliefern
% und die Anfrage father(X, sue) entsprechend X = tom. Verwenden Sie
% dieses beiden Prädikate in der Folge beispielsweise, um zu
% �berpr�fen, wer die Mutter und der Vater von jim ist. Und mit welcher
% Abfrage k�nnen Sie herausfinden, wie alle Kinder von Mary heissen?
mother(X,Y):-
    female(X),
    parent(X,Y).

father(X,Y):-
    male(X),
    parent(X,Y).

% ---------------------
% ------ 1b) --------
% Implementieren Sie ein weiteres Pr�dikat sibling/2, welches �berpr�ft, ob zwei Personen
% Geschwister sind. Auf die Anfrage sibling(mia, fred) wird also beispielsweise die Antwort
%  true erwartet. Hinweis 1: Da wir bisher keine Negation kennen, ist es
%  ok, wenn eine Person ein Geschwister von sich selbst ist, wenn also
%  z.B. das System auf sibling(sue, sue) mit true antwortet.
%  Negation, also wie wir z.B. sagen k�nnen �nicht(X=Y)�, schauen wir
%  sp�ter an
sibling(X,Y):-
    parent(Z,X),
    parent(Z,Y).

% ---------------------
% ------ 1c) --------
%  Implementieren Sie ein Pr�dikat grandmother/2. Die Anfrage
% grandmother(X, ann) soll dann also beispielsweise X = mary
% zur�ckliefern und die Anfrage grandmother(liz, X) entsprechend
%  X = sue; X = jim. Lassen Sie sich mit diesem Pr�dikat alle
%  Grossm�tter von jim ausgeben. Wie lautet die entsprechende Anfrage?

grandmother(X,Y):-
    parent(Z,Y),
    mother(X,Z).

% ---------------------
% ------ 1d) --------
% Implementieren Sie zum Schluss ein Pr�dikat offspring/2, welche erf�llt ist, wenn Person 1
% (erstes Argument) ein Nachkomme von Person 2 (zweites Argument) ist. Auf die Anfrage
% offspring(ann, mary) soll das System also mit true antworten. Oder auf die Anfrage
% offspring(sue, X) (Bedeutung: wer sind alle Vorfahren von Sue?) soll das System antworten
% mit X = tina; X = tom; X = mary; X = mike; X = liz; X = jack. Hinweis: Dieses
% Pr�dikat ist rekursiv und definiert eine transitive H�lle, analog zum Beispiel is_bigger/2 von den
% Unterrichtsfolien.
offspring(X,Y):-
    parent(Y,X).
offspring(X,Y):-
    parent(Z,X),
    offspring(Z,Y).

