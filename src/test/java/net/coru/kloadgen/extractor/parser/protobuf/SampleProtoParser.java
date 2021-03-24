package net.coru.kloadgen.extractor.parser.protobuf;

import net.coru.kloadgen.extractor.parser.protobuf.dsl.*;

public class SampleProtoParser extends ProtoParser {
  SampleExceptionHandler handler;

  public SampleProtoParser(TokenStream input) {
    super(input, new RecognizerSharedState());
  }

  public SampleProtoParser(TokenStream input, RecognizerSharedState state) {
    super(input, state);
  }

  public void registerExceptionHandler(SampleExceptionHandler handler) {
    this.handler = handler;
  }

  public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
    handler.handle(tokenNames, e);
  }
}