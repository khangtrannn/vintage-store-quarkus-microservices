package org.khang.quarkus.microservices.book;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import io.quarkus.test.Mock;

@Mock
@RestClient
public class MockerNumberProxy implements NumberProxy {

  @Override
  public IsbnThirteen generateIsbnNumbers() {
    IsbnThirteen isbnThirteen = new IsbnThirteen();
    isbnThirteen.isbn13 = "13-mock";
    return isbnThirteen;
  }
  
}
