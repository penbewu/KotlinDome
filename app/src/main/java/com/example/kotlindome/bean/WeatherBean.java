package com.example.kotlindome.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 开发者   biwu
 * 创建时间 2021/9/6
 * 描述
 */
public class WeatherBean implements Serializable {


    /**
     * reason : 查询成功!
     * result : {"city":"北京","realtime":{"temperature":"23","humidity":"57","info":"多云","wid":"01","direct":"东风","power":"2级","aqi":"23"},"future":[{"date":"2021-09-06","temperature":"15/23℃","weather":"小雨转晴","wid":{"day":"07","night":"00"},"direct":"北风转西风"},{"date":"2021-09-07","temperature":"18/27℃","weather":"晴转多云","wid":{"day":"00","night":"01"},"direct":"南风转东南风"},{"date":"2021-09-08","temperature":"17/28℃","weather":"多云转小雨","wid":{"day":"01","night":"07"},"direct":"东南风转东北风"},{"date":"2021-09-09","temperature":"17/25℃","weather":"阴转晴","wid":{"day":"02","night":"00"},"direct":"东南风转北风"},{"date":"2021-09-10","temperature":"19/28℃","weather":"晴转多云","wid":{"day":"00","night":"01"},"direct":"东南风转西风"}]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * city : 北京
         * realtime : {"temperature":"23","humidity":"57","info":"多云","wid":"01","direct":"东风","power":"2级","aqi":"23"}
         * future : [{"date":"2021-09-06","temperature":"15/23℃","weather":"小雨转晴","wid":{"day":"07","night":"00"},"direct":"北风转西风"},{"date":"2021-09-07","temperature":"18/27℃","weather":"晴转多云","wid":{"day":"00","night":"01"},"direct":"南风转东南风"},{"date":"2021-09-08","temperature":"17/28℃","weather":"多云转小雨","wid":{"day":"01","night":"07"},"direct":"东南风转东北风"},{"date":"2021-09-09","temperature":"17/25℃","weather":"阴转晴","wid":{"day":"02","night":"00"},"direct":"东南风转北风"},{"date":"2021-09-10","temperature":"19/28℃","weather":"晴转多云","wid":{"day":"00","night":"01"},"direct":"东南风转西风"}]
         */

        private String city;
        private RealtimeBean realtime;
        private List<FutureBean> future;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public RealtimeBean getRealtime() {
            return realtime;
        }

        public void setRealtime(RealtimeBean realtime) {
            this.realtime = realtime;
        }

        public List<FutureBean> getFuture() {
            return future;
        }

        public void setFuture(List<FutureBean> future) {
            this.future = future;
        }

        public static class RealtimeBean {
            /**
             * temperature : 23
             * humidity : 57
             * info : 多云
             * wid : 01
             * direct : 东风
             * power : 2级
             * aqi : 23
             */

            private String temperature;
            private String humidity;
            private String info;
            private String wid;
            private String direct;
            private String power;
            private String aqi;

            public String getTemperature() {
                return temperature;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }

            public String getHumidity() {
                return humidity;
            }

            public void setHumidity(String humidity) {
                this.humidity = humidity;
            }

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public String getWid() {
                return wid;
            }

            public void setWid(String wid) {
                this.wid = wid;
            }

            public String getDirect() {
                return direct;
            }

            public void setDirect(String direct) {
                this.direct = direct;
            }

            public String getPower() {
                return power;
            }

            public void setPower(String power) {
                this.power = power;
            }

            public String getAqi() {
                return aqi;
            }

            public void setAqi(String aqi) {
                this.aqi = aqi;
            }
        }

        public static class FutureBean {
            /**
             * date : 2021-09-06
             * temperature : 15/23℃
             * weather : 小雨转晴
             * wid : {"day":"07","night":"00"}
             * direct : 北风转西风
             */

            private String date;
            private String temperature;
            private String weather;
            private WidBean wid;
            private String direct;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getTemperature() {
                return temperature;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public WidBean getWid() {
                return wid;
            }

            public void setWid(WidBean wid) {
                this.wid = wid;
            }

            public String getDirect() {
                return direct;
            }

            public void setDirect(String direct) {
                this.direct = direct;
            }

            public static class WidBean {
                /**
                 * day : 07
                 * night : 00
                 */

                private String day;
                private String night;

                public String getDay() {
                    return day;
                }

                public void setDay(String day) {
                    this.day = day;
                }

                public String getNight() {
                    return night;
                }

                public void setNight(String night) {
                    this.night = night;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "WeatherBean{" +
                "reason='" + reason + '\'' +
                ", result=" + result +
                ", error_code=" + error_code +
                '}';
    }
}
