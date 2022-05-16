import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class RenderGradesTest {


    @Test
    public void fortyNineShouldRender_F(){
        RenderGrades renderGrades = new RenderGrades();
        String grade = renderGrades.getGrades(49);
        Assertions.assertSame("F", grade);
    }
    @Test
    public void fiftyNineShouldRender_D(){
        RenderGrades renderGrades = new RenderGrades();
        String grade = renderGrades.getGrades(59);
        Assertions.assertSame("D", grade);
    }
    @Test
    public void seventyFourShouldRender_C(){
        RenderGrades renderGrades = new RenderGrades();
        String grade = renderGrades.getGrades(74);
        Assertions.assertSame("C", grade);
    }
    @Test
    public void eightNineShouldRender_A(){
        RenderGrades renderGrades = new RenderGrades();
        String grade = renderGrades.getGrades(89);
        Assertions.assertSame("A", grade);
    }
    @Test
    public void ninetyNineShouldRender_A_Plus(){
        RenderGrades renderGrades = new RenderGrades();
        String grade = renderGrades.getGrades(99);
        Assertions.assertSame("A+", grade);
    }
    @Test
    public void seventyNineShouldRender_B(){
        RenderGrades renderGrades = new RenderGrades();
        String grade = renderGrades.getGrades(79);
        Assertions.assertSame("B", grade);
    }
    @Test
    public void oneTwentyThreeShouldThrow_IllegalArgumentExpression(){
        RenderGrades renderGrades = new RenderGrades();
        Assertions.assertThrows(IllegalArgumentException.class,
                ()-> renderGrades.getGrades(123),
                "Negative Percentile entered !!!");
    }
    @Test
    public void minusFourShouldRender_IllegalArgumentExpression(){
        RenderGrades renderGrades = new RenderGrades();
        Assertions.assertThrows(IllegalArgumentException.class,
                ()->  renderGrades.getGrades(-4),
                "Negative Percentile entered !!!");
    }


}