package com.example.bookstoreapi;
public class CustomPriceSerializer extends JsonSerializer<Double> {
    @Override
    public void serialize(Double value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeString("$" + value);
    }
}

