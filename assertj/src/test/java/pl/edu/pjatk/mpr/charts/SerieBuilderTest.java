package pl.edu.pjatk.mpr.charts;

import org.junit.Before;
import org.junit.Test;
import pl.edu.pjatk.mpr.charts.domain.ChartSerie;
import pl.edu.pjatk.mpr.charts.domain.Point;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Krzysztof on 09/01/16.
 */
public class SerieBuilderTest {

    private SerieBuilder serieBuilder;

    @Before
    public void before() {
        serieBuilder = new SerieBuilder();
    }

    @Test
    public void testIfPointIsAdded() {
        // GIVEN
        Point point = new Point(1, 2);

        // WHEN
        ChartSerie serie = serieBuilder.addPoint(point).build();

        // THEN
        assertThat(serie.getPoints()).isNotNull().containsOnly(point);
    }

    @Test
    public void testIfLabelAdded() {
        // GIVEN
        String label = "l";

        // WHEN
        ChartSerie serie = serieBuilder.addLabel(label).build();

        // THEN
        assertThat(serie.getLabel()).isEqualTo(label);
    }

}
