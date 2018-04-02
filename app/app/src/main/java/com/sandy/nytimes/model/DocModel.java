package com.sandy.nytimes.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by USER on 3/29/2018.
 */

public class DocModel implements Parcelable
{

    @SerializedName("web_url")
    @Expose
    private String webUrl;
    @SerializedName("snippet")
    @Expose
    private String snippet;
    @SerializedName("lead_paragraph")
    @Expose
    private String leadParagraph;
//    @SerializedName("abstract")
//    @Expose
//    private Object _abstract;
//    @SerializedName("print_page")
//    @Expose
//    private Integer printPage;
//    @SerializedName("blog")
//    @Expose
//    private List<Object> blog = null;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("multimedia")
    @Expose
    private List<MultimediumModel> multimedia = null;
    @SerializedName("headline")
    @Expose
    private HeadlineModel headline;
    @SerializedName("keywords")
    @Expose
    private List<KeywordModel> keywords = null;
    @SerializedName("pub_date")
    @Expose
    private String pubDate;
    @SerializedName("document_type")
    @Expose
    private String documentType;
    @SerializedName("news_desk")
    @Expose
    private String newsDesk;
    @SerializedName("section_name")
    @Expose
    private String sectionName;
    @SerializedName("subsection_name")
    @Expose
    private String subsectionName;
//    @SerializedName("byline")
//    @Expose
//    private BylineModel byline;
    @SerializedName("type_of_material")
    @Expose
    private String typeOfMaterial;
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("word_count")
    @Expose
    private Integer wordCount;
//    @SerializedName("slideshow_credits")
//    @Expose
//    private Object slideshowCredits;
    public final static Parcelable.Creator<DocModel> CREATOR = new Creator<DocModel>() {


        @SuppressWarnings({
                "unchecked"
        })
        public DocModel createFromParcel(Parcel in) {
            return new DocModel(in);
        }

        public DocModel[] newArray(int size) {
            return (new DocModel[size]);
        }

    }
            ;

    protected DocModel(Parcel in) {
        this.webUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.snippet = ((String) in.readValue((String.class.getClassLoader())));
        this.leadParagraph = ((String) in.readValue((String.class.getClassLoader())));
//        this._abstract = ((Object) in.readValue((Object.class.getClassLoader())));
//        this.printPage = ((Integer) in.readValue((Integer.class.getClassLoader())));
//        in.readList(this.blog, (java.lang.Object.class.getClassLoader()));
        this.source = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.multimedia, (MultimediumModel.class.getClassLoader()));
        this.headline = ((HeadlineModel) in.readValue((HeadlineModel.class.getClassLoader())));
        in.readList(this.keywords, (KeywordModel.class.getClassLoader()));
        this.pubDate = ((String) in.readValue((String.class.getClassLoader())));
        this.documentType = ((String) in.readValue((String.class.getClassLoader())));
        this.newsDesk = ((String) in.readValue((String.class.getClassLoader())));
        this.sectionName = ((String) in.readValue((String.class.getClassLoader())));
        this.subsectionName = ((String) in.readValue((String.class.getClassLoader())));
//        this.byline = ((BylineModel) in.readValue((BylineModel.class.getClassLoader())));
        this.typeOfMaterial = ((String) in.readValue((String.class.getClassLoader())));
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.wordCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
//        this.slideshowCredits = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    public DocModel() {
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public String getLeadParagraph() {
        return leadParagraph;
    }

    public void setLeadParagraph(String leadParagraph) {
        this.leadParagraph = leadParagraph;
    }
//
//    public Object getAbstract() {
//        return _abstract;
//    }
//
//    public void setAbstract(Object _abstract) {
//        this._abstract = _abstract;
//    }
//
//    public Integer getPrintPage() {
//        return printPage;
//    }
//
//    public void setPrintPage(Integer printPage) {
//        this.printPage = printPage;
//    }
//
//    public List<Object> getBlog() {
//        return blog;
//    }
//
//    public void setBlog(List<Object> blog) {
//        this.blog = blog;
//    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public List<MultimediumModel> getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(List<MultimediumModel> multimedia) {
        this.multimedia = multimedia;
    }

    public HeadlineModel getHeadline() {
        return headline;
    }

    public void setHeadline(HeadlineModel headline) {
        this.headline = headline;
    }

    public List<KeywordModel> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<KeywordModel> keywords) {
        this.keywords = keywords;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getNewsDesk() {
        return newsDesk;
    }

    public void setNewsDesk(String newsDesk) {
        this.newsDesk = newsDesk;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getSubsectionName() {
        return subsectionName;
    }

    public void setSubsectionName(String subsectionName) {
        this.subsectionName = subsectionName;
    }

//    public BylineModel getByline() {
//        return byline;
//    }
//
//    public void setByline(BylineModel byline) {
//        this.byline = byline;
//    }

    public String getTypeOfMaterial() {
        return typeOfMaterial;
    }

    public void setTypeOfMaterial(String typeOfMaterial) {
        this.typeOfMaterial = typeOfMaterial;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getWordCount() {
        return wordCount;
    }

    public void setWordCount(Integer wordCount) {
        this.wordCount = wordCount;
    }

//    public Object getSlideshowCredits() {
//        return slideshowCredits;
//    }
//
//    public void setSlideshowCredits(Object slideshowCredits) {
//        this.slideshowCredits = slideshowCredits;
//    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(webUrl);
        dest.writeValue(snippet);
        dest.writeValue(leadParagraph);
//        dest.writeValue(_abstract);
//        dest.writeValue(printPage);
//        dest.writeList(blog);
        dest.writeValue(source);
        dest.writeList(multimedia);
        dest.writeValue(headline);
        dest.writeList(keywords);
        dest.writeValue(pubDate);
        dest.writeValue(documentType);
        dest.writeValue(newsDesk);
        dest.writeValue(sectionName);
        dest.writeValue(subsectionName);
//        dest.writeValue(byline);
        dest.writeValue(typeOfMaterial);
        dest.writeValue(id);
        dest.writeValue(wordCount);
//        dest.writeValue(slideshowCredits);
    }

    public int describeContents() {
        return 0;
    }

}