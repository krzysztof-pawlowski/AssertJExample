package pl.edu.pjatk.mpr.charts.domain;

import java.util.List;

/**
 * Created by Krzysztof on 09/01/16.
 */
public class ChartSettings {
    private List<ChartSerie> series;
    private String title;
    private String subtitle;
    private boolean hasLegend;
    private ChartType chartType;

    public List<ChartSerie> getSeries() {
        return series;
    }

    public void setSeries(List<ChartSerie> series) {
        this.series = series;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public boolean isHasLegend() {
        return hasLegend;
    }

    public void setHasLegend(boolean hasLegend) {
        this.hasLegend = hasLegend;
    }

    public ChartType getChartType() {
        return chartType;
    }

    public void setChartType(ChartType chartType) {
        this.chartType = chartType;
    }
}
