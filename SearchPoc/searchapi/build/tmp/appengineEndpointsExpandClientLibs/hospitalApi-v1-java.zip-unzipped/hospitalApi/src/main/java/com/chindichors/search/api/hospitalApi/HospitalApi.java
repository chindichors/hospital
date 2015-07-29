/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2015-07-16 18:28:29 UTC)
 * on 2015-07-29 at 13:00:06 UTC 
 * Modify at your own risk.
 */

package com.chindichors.search.api.hospitalApi;

/**
 * Service definition for HospitalApi (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link HospitalApiRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class HospitalApi extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.20.0 of the hospitalApi library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://chindichors-searchapi.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "hospitalApi/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public HospitalApi(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  HospitalApi(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getHospital".
   *
   * This request holds the parameters needed by the hospitalApi server.  After setting any optional
   * parameters, call the {@link GetHospital#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public GetHospital getHospital(java.lang.String id) throws java.io.IOException {
    GetHospital result = new GetHospital(id);
    initialize(result);
    return result;
  }

  public class GetHospital extends HospitalApiRequest<com.chindichors.search.api.hospitalApi.model.Hospital> {

    private static final String REST_PATH = "hospital/{id}";

    /**
     * Create a request for the method "getHospital".
     *
     * This request holds the parameters needed by the the hospitalApi server.  After setting any
     * optional parameters, call the {@link GetHospital#execute()} method to invoke the remote
     * operation. <p> {@link
     * GetHospital#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetHospital(java.lang.String id) {
      super(HospitalApi.this, "GET", REST_PATH, null, com.chindichors.search.api.hospitalApi.model.Hospital.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetHospital setAlt(java.lang.String alt) {
      return (GetHospital) super.setAlt(alt);
    }

    @Override
    public GetHospital setFields(java.lang.String fields) {
      return (GetHospital) super.setFields(fields);
    }

    @Override
    public GetHospital setKey(java.lang.String key) {
      return (GetHospital) super.setKey(key);
    }

    @Override
    public GetHospital setOauthToken(java.lang.String oauthToken) {
      return (GetHospital) super.setOauthToken(oauthToken);
    }

    @Override
    public GetHospital setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetHospital) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetHospital setQuotaUser(java.lang.String quotaUser) {
      return (GetHospital) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetHospital setUserIp(java.lang.String userIp) {
      return (GetHospital) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String id;

    /**

     */
    public java.lang.String getId() {
      return id;
    }

    public GetHospital setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    @Override
    public GetHospital set(String parameterName, Object value) {
      return (GetHospital) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertHospital".
   *
   * This request holds the parameters needed by the hospitalApi server.  After setting any optional
   * parameters, call the {@link InsertHospital#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.chindichors.search.api.hospitalApi.model.Hospital}
   * @return the request
   */
  public InsertHospital insertHospital(com.chindichors.search.api.hospitalApi.model.Hospital content) throws java.io.IOException {
    InsertHospital result = new InsertHospital(content);
    initialize(result);
    return result;
  }

  public class InsertHospital extends HospitalApiRequest<com.chindichors.search.api.hospitalApi.model.Hospital> {

    private static final String REST_PATH = "hospital";

    /**
     * Create a request for the method "insertHospital".
     *
     * This request holds the parameters needed by the the hospitalApi server.  After setting any
     * optional parameters, call the {@link InsertHospital#execute()} method to invoke the remote
     * operation. <p> {@link InsertHospital#initialize(com.google.api.client.googleapis.services.Abstr
     * actGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param content the {@link com.chindichors.search.api.hospitalApi.model.Hospital}
     * @since 1.13
     */
    protected InsertHospital(com.chindichors.search.api.hospitalApi.model.Hospital content) {
      super(HospitalApi.this, "POST", REST_PATH, content, com.chindichors.search.api.hospitalApi.model.Hospital.class);
    }

    @Override
    public InsertHospital setAlt(java.lang.String alt) {
      return (InsertHospital) super.setAlt(alt);
    }

    @Override
    public InsertHospital setFields(java.lang.String fields) {
      return (InsertHospital) super.setFields(fields);
    }

    @Override
    public InsertHospital setKey(java.lang.String key) {
      return (InsertHospital) super.setKey(key);
    }

    @Override
    public InsertHospital setOauthToken(java.lang.String oauthToken) {
      return (InsertHospital) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertHospital setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertHospital) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertHospital setQuotaUser(java.lang.String quotaUser) {
      return (InsertHospital) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertHospital setUserIp(java.lang.String userIp) {
      return (InsertHospital) super.setUserIp(userIp);
    }

    @Override
    public InsertHospital set(String parameterName, Object value) {
      return (InsertHospital) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link HospitalApi}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link HospitalApi}. */
    @Override
    public HospitalApi build() {
      return new HospitalApi(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link HospitalApiRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setHospitalApiRequestInitializer(
        HospitalApiRequestInitializer hospitalapiRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(hospitalapiRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}