import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RenderGradesTest {


    @Test
    public void fortyNineShouldRender_F(){
        RenderGrades renderGrades = new RenderGrades();
        String grade = renderGrades.getGrades(49);
        assertTrue(grade == "F");
    }
    @Test
    public void fiftyNineShouldRender_D(){
        RenderGrades renderGrades = new RenderGrades();
        String grade = renderGrades.getGrades(59);
        assertTrue(grade == "D");
    }
    @Test
    public void seventyFourShouldRender_C(){
        RenderGrades renderGrades = new RenderGrades();
        String grade = renderGrades.getGrades(74);
        assertTrue(grade == "C");
    }
    @Test
    public void eightNineShouldRender_A(){
        RenderGrades renderGrades = new RenderGrades();
        String grade = renderGrades.getGrades(89);
        assertTrue(grade == "A");
    }
    @Test
    public void ninetyNineShouldRender_A_Plus(){
        RenderGrades renderGrades = new RenderGrades();
        String grade = renderGrades.getGrades(99);
        assertTrue(grade == "A+");
    }
    @Test
    public void seventyNineShouldRender_B(){
        RenderGrades renderGrades = new RenderGrades();
        String grade = renderGrades.getGrades(79);
        assertTrue(grade == "B");
    }
    @Test
    public void oneTwentyThreeShouldThrow_IllegalArgumentExpression(){
        RenderGrades renderGrades = new RenderGrades();
        assertThrows(IllegalArgumentException.class,
                ()-> renderGrades.getGrades(123),
                "Percentile cannot be over 100!!!");
    }
    @Test
    public void minusFourShouldRender_IllegalArgumentExpression(){
        RenderGrades renderGrades = new RenderGrades();
        assertThrows(IllegalArgumentException.class,
                ()->  renderGrades.getGrades(-4),
                "Negative Percentile entered !!!");
    }


}