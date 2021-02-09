package com.iamrajendra.magicstr.main;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;

public class RString {
    private String TAG = RString.class.getSimpleName();
    private String strMain;
    private SpannableString spannableString;

    public RString(String strMain) {
        this.strMain = strMain;
        spannableString = new SpannableString(strMain);
    }

    public RString setForegroundColor(String text, int color) {
        int left = strMain.indexOf(text);
        int right = left + text.length();
        spannableString.setSpan(new ForegroundColorSpan(color), left, right, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        return this;
    }

    public RString setBackGroundColor(String text, int color) {
        int left = strMain.indexOf(text);
        int right = left + text.length();
        spannableString.setSpan(new BackgroundColorSpan(color), left, right, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        return this;
    }

    public RString setBold(String text) {
        int left = strMain.indexOf(text);
        int right = left + text.length();
        spannableString.setSpan(new StyleSpan(Typeface.BOLD), left, right, 0);
        return this;
    }

    public RString setClick(String text, ClickableSpan clickableSpan) {
        int left = strMain.indexOf(text);
        int right = left + text.length();
        spannableString.setSpan(clickableSpan, left, right, 0);
        return this;
    }
    public RString setHyperLink(String url, URLSpan urlSpan) {
        int left = strMain.indexOf(url);
        int right = left + url.length();
        spannableString.setSpan(urlSpan, left, right, 0);
        return this;
    }

    @Override
    public String toString() {
        return spannableString.toString();
    }
}
