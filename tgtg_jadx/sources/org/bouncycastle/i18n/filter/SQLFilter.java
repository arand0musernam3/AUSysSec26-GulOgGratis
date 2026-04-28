package org.bouncycastle.i18n.filter;

import zendesk.core.ui.android.internal.xml.richtext.codeblock.CodeBlockHandler;

/* JADX INFO: loaded from: classes3.dex */
public class SQLFilter implements Filter {
    @Override // org.bouncycastle.i18n.filter.Filter
    public String doFilter(String str) {
        int i11;
        String str2;
        StringBuffer stringBuffer = new StringBuffer(str);
        int i12 = 0;
        while (i12 < stringBuffer.length()) {
            char cCharAt = stringBuffer.charAt(i12);
            if (cCharAt == '\n') {
                i11 = i12 + 1;
                str2 = CodeBlockHandler.NEWLINE_REGEX;
            } else if (cCharAt == '\r') {
                i11 = i12 + 1;
                str2 = "\\r";
            } else if (cCharAt == '\"') {
                i11 = i12 + 1;
                str2 = "\\\"";
            } else if (cCharAt == '\'') {
                i11 = i12 + 1;
                str2 = "\\'";
            } else if (cCharAt == '-') {
                i11 = i12 + 1;
                str2 = "\\-";
            } else if (cCharAt == '/') {
                i11 = i12 + 1;
                str2 = "\\/";
            } else if (cCharAt == ';') {
                i11 = i12 + 1;
                str2 = "\\;";
            } else if (cCharAt == '=') {
                i11 = i12 + 1;
                str2 = "\\=";
            } else if (cCharAt != '\\') {
                i12++;
            } else {
                i11 = i12 + 1;
                str2 = "\\\\";
            }
            stringBuffer.replace(i12, i11, str2);
            i12 = i11;
            i12++;
        }
        return stringBuffer.toString();
    }

    @Override // org.bouncycastle.i18n.filter.Filter
    public String doFilterUrl(String str) {
        return doFilter(str);
    }
}
