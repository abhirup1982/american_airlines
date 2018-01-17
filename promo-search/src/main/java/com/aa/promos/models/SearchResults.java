package com.aa.promos.models;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SearchResults {
    private String promoCode;
    private String promoName;

    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate promoStartDt;

    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate promoEndDt;

    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

    public String getPromoName() {
        return promoName;
    }

    public void setPromoName(String promoName) {
        this.promoName = promoName;
    }

    public LocalDate getPromoStartDt() {
        return promoStartDt;
    }

    public void setPromoStartDt(LocalDate promoStartDt) {
        this.promoStartDt = promoStartDt;
    }

    public LocalDate getPromoEndDt() {
        return promoEndDt;
    }

    public void setPromoEndDt(LocalDate promoEndDt) {
        this.promoEndDt = promoEndDt;
    }

    public static class LocalDateDeserializer extends StdDeserializer<LocalDate> {

        private static final long serialVersionUID = 1L;

        protected LocalDateDeserializer() {
            super(LocalDate.class);
        }


        @Override
        public LocalDate deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException {
            String date = jp.readValueAs(String.class);
            if(date == null || date.trim().length() == 0) {
                return null;
            }
            return LocalDate.parse(date, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        }

    }

    public static class LocalDateSerializer extends StdSerializer<LocalDate> {

        private static final long serialVersionUID = 1L;

        public LocalDateSerializer(){
            super(LocalDate.class);
        }

        @Override
        public void serialize(LocalDate value, JsonGenerator gen, SerializerProvider sp) throws IOException {
            gen.writeString(value.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
        }
    }
}
