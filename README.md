Using binary expression trees, write an infix expression parser. Here are a few examples of
expressions your program should parse and evaluate.

1) (Weight: 40%) Your parser should parse an infix expression that supports the following
arithmetic and logical operators with the specified precedencies.

2) (Weight: 30%) Parse an expression given in a string format. Your program should be flexible
with the given expressions. For instance, "1+2" is the same as "1 + 2". The user should not
worry about writing the spaces between operands and operators.

3) (Weight: 20%) Evaluate the given expression efficiently.

4) (Weight: 10%) Your main() program should ask the user to enter an expression via keyboard,
then output the evaluation result to the standard console (screen).

5) (Weight: Extra 10%) Use GitHub to manage your project.

Facts and Assumptions

1) You may assume that all operands are integers.

2) For divisions, you need to get the integer result (e.g. "3 / 2" should be evaluated to 1 instead
of 1.5).

3) The result of a comparison is a boolean. However, a boolean can be converted to an integer
according to the logic of true = 1 and false = 0. Also, an integer can be converted to a
boolean according to the logic that a number equal to zero is false; otherwise, it is true.

4) Take a look at the algorithm in the following link for inspiration. The algorithm constructs a
binary expression tree from a postfix expression. In this project, however, you are required to
build the tree from an infix expression.
https://en.wikipedia.org/wiki/Binary_expression_tree#Construction_of_an_expression_tree

5) You can assume that the users always input valid expressions. However, if the input expression
to be evaluated is "3 / (6 * 5 − 30)", your program should prompt the user that there is a
divide-by-zero error, instead of a crash.
