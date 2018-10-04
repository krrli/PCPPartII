#include <stdio.h>


/*
	typischer imperativen C-Code mit einer goto - Anweisung
	0 1 2 3 4 5 6 7 = printNumbersGoto(7)
*/
void printNumbersGoto(int untilNumberX) {		

	if (untilNumberX < 0) return;	

	int i = 0;
	iPlusPlusAndContinue:
	printf(" %i ", i);
	i++;
	if (i <= untilNumberX) goto iPlusPlusAndContinue;	

}

/*
	typischer strukturierten C-Code mit einer for-Anweisung
*/
void printNumbersFor(int untilNumberX) {
	for (int i = 0; i <= untilNumberX; i++) {
		printf(" %i ", i);
	}	
}

/*
	typischer prozeduraler Code mit einer rekursiven Funktion
*/
void printNumbersRecursiveFunction(int untilNumberX) {
	if (untilNumberX >= 0) {
		// print backwards
		//printf(" %i ", untilNumberX);
		printNumbersRecursiveFunction(untilNumberX - 1);
		printf(" %i ", untilNumberX);
	}
	
}


/*
int main() {
	int countTo = 7;
	printNumbersGoto(countTo);
	printf("= printNumbersGoto(%i)\n", countTo);

	printNumbersFor(countTo);
	printf("= printNumbersFor(%i)\n", countTo);

	printNumbersRecursiveFunction(countTo);
	printf("= printNumbersRecursiveFunction(%i)\n", countTo);
	return 0;
}

*/

