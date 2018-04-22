# Glarmester_solution
Denne opgave er blevet skrevet af Laura Hartig og Michael Daugbjerg.

### Test klassen for Glarmester_Solution kan blive fundet [her](https://github.com/michael2750/Glarmester_solution/blob/master/test/glarmester_solution/data/TopDownTest.java)

- Test Metode: Vi har valgt at lave en top down test og bruge databasen som en slags dummy, da den indeholder meget lidt information.
Vi tester derfor på modulerne; `DataAccessorDatabase` og `DBConnector`. Top down vil sige at vi tester fra de øvre lag, som accessoren og connecteren
og vi har derfor mulighed for at stubbe databasen, som gør det muligt at teste dette.

- Manuel eller automated testing?: Vi vil bruge manuel testing eftersom at testende kun skal passe en gang.
Det ville være et tidsspil at skulle sætte det op med tools.

- Test cases:
![Test cases](https://github.com/michael2750/Glarmester_solution/blob/master/TestCases.png)

- Test results:
![Test results](https://github.com/michael2750/Glarmester_solution/blob/master/TestResults.PNG)
