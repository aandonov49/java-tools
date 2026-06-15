package com.ad4u.bg.providers;

import jakarta.inject.Inject;
import jakarta.ws.rs.ext.ContextResolver;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonObjectMapperProvider implements ContextResolver<ObjectMapper> {
  @Inject
  ObjectMapper objectMapper;

  @Override
  public ObjectMapper getContext(Class<?> aClass) {
    return objectMapper;
  }
}
