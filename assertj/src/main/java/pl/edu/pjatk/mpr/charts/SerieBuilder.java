package pl.edu.pjatk.mpr.charts;

import pl.edu.pjatk.mpr.charts.domain.ChartSerie;
import pl.edu.pjatk.mpr.charts.domain.Point;
import pl.edu.pjatk.mpr.charts.domain.SerieType;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Krzysztof on 09/01/16.
 */
public class SerieBuilder {

    private ChartSerie chartSerie;

    public SerieBuilder() {
        chartSerie = new ChartSerie();
    }

    public SerieBuilder addPoint(Point point) {
        List<Point> points = chartSerie.getPoints();
        if (points == null) {
            points = new LinkedList<Point>();
            chartSerie.setPoints(points);
        }
        points.add(point);
        return this;
    }

    public SerieBuilder addLabel(String label) {
        chartSerie.setLabel(label);
        return this;
    }

    public SerieBuilder withPoints(List<Point> points) {
        chartSerie.setPoints(points);
        return this;
    }

    public SerieBuilder setType(SerieType type) {
        chartSerie.setSerieType(type);
        return this;
    }

    public ChartSerie build() {
        return chartSerie;
    }
}
