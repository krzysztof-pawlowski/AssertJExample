package pl.edu.pjatk.mpr.charts.domain;

import java.util.List;

/**
 * Created by Krzysztof on 09/01/16.
 */
public class ChartSerie {
    private String label;
    private List<Point> points;
    private SerieType serieType;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public SerieType getSerieType() {
        return serieType;
    }

    public void setSerieType(SerieType serieType) {
        this.serieType = serieType;
    }
}
