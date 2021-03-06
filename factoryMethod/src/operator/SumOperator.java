package operator;

/**
 * Sums two numbers and display the result
 *
 * @author Hélio Márcio Matos dos Santos Filho
 * @version 1.0
 * @since 0.0.1-SNAPSHOT
 */
public class SumOperator implements Operator {

    @Override
    public void operate(double input1, double input2) {
        System.out.println("The sum is: " + (input1 + input2 ));
    }
}
