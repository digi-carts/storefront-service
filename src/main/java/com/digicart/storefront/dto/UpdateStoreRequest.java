package com.digicart.storefront.dto;

/**
 * Request/response DTO: Update Store Request.
 */
public class UpdateStoreRequest {

    private String name;
    private String subdomain;
    private String storeUrlId;
    private String domain;
    private String email;
    private String phone;
    private String currency;
    private Boolean published;
    private String template;
    private String branding;

    /**
     * Creates a new {@code UpdateStoreRequest}.
     */
    public UpdateStoreRequest() {}
    /**
     * Returns name.
     * @return the string
     */
    public String getName() { return name; }
    /**
     * Sets name.
     *
     * @param name name
     */
    public void setName(String name) { this.name = name; }
    /**
     * Returns subdomain.
     * @return the string
     */
    public String getSubdomain() { return subdomain; }
    /**
     * Sets subdomain.
     *
     * @param subdomain store subdomain
     */
    public void setSubdomain(String subdomain) { this.subdomain = subdomain; }
    /**
     * Returns store url id.
     * @return the string
     */
    public String getStoreUrlId() { return storeUrlId; }
    /**
     * Sets store url id.
     *
     * @param storeUrlId store url id
     */
    public void setStoreUrlId(String storeUrlId) { this.storeUrlId = storeUrlId; }
    /**
     * Returns domain.
     * @return the string
     */
    public String getDomain() { return domain; }
    /**
     * Sets domain.
     *
     * @param domain domain
     */
    public void setDomain(String domain) { this.domain = domain; }
    /**
     * Returns email.
     * @return the string
     */
    public String getEmail() { return email; }
    /**
     * Sets email.
     *
     * @param email email address
     */
    public void setEmail(String email) { this.email = email; }
    /**
     * Returns phone.
     * @return the string
     */
    public String getPhone() { return phone; }
    /**
     * Sets phone.
     *
     * @param phone phone
     */
    public void setPhone(String phone) { this.phone = phone; }
    /**
     * Returns currency.
     * @return the string
     */
    public String getCurrency() { return currency; }
    /**
     * Sets currency.
     *
     * @param currency currency
     */
    public void setCurrency(String currency) { this.currency = currency; }
    /**
     * Returns published.
     * @return the boolean
     */
    public Boolean getPublished() { return published; }
    /**
     * Sets published.
     *
     * @param published published
     */
    public void setPublished(Boolean published) { this.published = published; }
    /**
     * Returns template.
     * @return the string
     */
    public String getTemplate() { return template; }
    /**
     * Sets template.
     *
     * @param template template
     */
    public void setTemplate(String template) { this.template = template; }
    /**
     * Returns branding.
     * @return the string
     */
    public String getBranding() { return branding; }
    /**
     * Sets branding.
     *
     * @param branding branding
     */
    public void setBranding(String branding) { this.branding = branding; }
}
