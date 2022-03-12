package t1;

import java.util.Date;

/**
 * Project name(项目名称)：MyBatis_select
 * Package(包名): t1
 * Class(类名): Website
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/12
 * Time(创建时间)： 18:33
 * Version(版本): 1.0
 * Description(描述)： 无
 */
public class Website
{
    private int id;
    private String name;
    private String url;
    private int age;
    private String country;
    private Date createTime;

    /**
     * Instantiates a new Website.
     */
    public Website()
    {
    }

    /**
     * Instantiates a new Website.
     *
     * @param id         the id
     * @param name       the name
     * @param url        the url
     * @param age        the age
     * @param country    the country
     * @param createTime the create time
     */
    public Website(int id, String name, String url, int age, String country, Date createTime)
    {
        this.id = id;
        this.name = name;
        this.url = url;
        this.age = age;
        this.country = country;
        this.createTime = createTime;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId()
    {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Gets url.
     *
     * @return the url
     */
    public String getUrl()
    {
        return url;
    }

    /**
     * Sets url.
     *
     * @param url the url
     */
    public void setUrl(String url)
    {
        this.url = url;
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public int getAge()
    {
        return age;
    }

    /**
     * Sets age.
     *
     * @param age the age
     */
    public void setAge(int age)
    {
        this.age = age;
    }

    /**
     * Gets country.
     *
     * @return the country
     */
    public String getCountry()
    {
        return country;
    }

    /**
     * Sets country.
     *
     * @param country the country
     */
    public void setCountry(String country)
    {
        this.country = country;
    }

    /**
     * Gets create time.
     *
     * @return the create time
     */
    public Date getCreateTime()
    {
        return createTime;
    }

    /**
     * Sets create time.
     *
     * @param createTime the create time
     */
    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("id：").append(id).append('\n');
        stringbuilder.append("name：").append(name).append('\n');
        stringbuilder.append("url：").append(url).append('\n');
        stringbuilder.append("age：").append(age).append('\n');
        stringbuilder.append("country：").append(country).append('\n');
        stringbuilder.append("createTime：").append(createTime).append('\n');
        return stringbuilder.toString();
    }
}
