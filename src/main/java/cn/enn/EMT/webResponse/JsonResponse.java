package cn.enn.EMT.webResponse;

import java.io.Serializable;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class JsonResponse<E> implements Serializable
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final JsonResponse<String> SUCCESS = new JsonResponse<String>(JsonResponseCode.SUCCESS, null);
    public static final JsonResponse<String> SYSTEM_EXCEPTION = new JsonResponse<String>(JsonResponseCode.SYSTEM_EXCEPTION, null);
    public static final JsonResponse<String> INVALID_REQUEST = new JsonResponse<String>(JsonResponseCode.INVALID_REQUEST, null);
    public static final JsonResponse<String> LOGIN_ERROR = new JsonResponse<String>(JsonResponseCode.LOGIN_ERROR, null);
    public static final JsonResponse<String> NOT_LOGIN = new JsonResponse<String>(JsonResponseCode.NOT_LOGIN_ERROR, null);

    private String code;
    private E data;

    public JsonResponse()
    {
        this(JsonResponseCode.SUCCESS);
    }

    public JsonResponse(String code)
    {
        this(code, null);
    }

    public JsonResponse(E data)
    {
        this(JsonResponseCode.SUCCESS, data);
    }

    public JsonResponse(String code, E data)
    {
        this.code = code;
        this.data = data;
    }

    public JsonResponse<E> setData(E data)
    {
        this.data = data;
        return this;
    }

    public String getCode()
    {
        return code;
    }

    public E getData()
    {
        return data;
    }
}