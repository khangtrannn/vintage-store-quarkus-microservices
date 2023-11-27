package org.khang.quarkus.microservices.number;

import java.time.Instant;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbTransient;

@Schema(description = "Several ISBN formats")
public class IsbnNumbers {

  @Schema(required = true)
  @JsonbProperty("isbn_10")
  public String isbn10;
  @Schema(required = true)
  @JsonbProperty("isbn_13")
  public String isbn13;
  @JsonbTransient
  public Instant generationDate;


  @Override
  public String toString() {
    return "IsbnNumbers{" +
      "isbn10='" + isbn10 + '\'' +
      ", isbn13='" + isbn13 + '\'' +
      ", generationDate=" + generationDate +
      '}';
  }
}