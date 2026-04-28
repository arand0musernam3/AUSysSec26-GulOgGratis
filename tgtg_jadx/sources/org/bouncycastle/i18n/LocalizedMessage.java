package org.bouncycastle.i18n;

import com.adyen.checkout.components.core.Address;
import e0.f;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.Format;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.TimeZone;
import org.bouncycastle.i18n.filter.Filter;
import org.bouncycastle.i18n.filter.TrustedInput;
import org.bouncycastle.i18n.filter.UntrustedInput;
import org.bouncycastle.i18n.filter.UntrustedUrlInput;
import org.bouncycastle.jce.provider.a;
import r8.k;
import w.a0;

/* JADX INFO: loaded from: classes3.dex */
public class LocalizedMessage {
    public static final String DEFAULT_ENCODING = "ISO-8859-1";
    protected FilteredArguments arguments;
    protected String encoding;
    protected FilteredArguments extraArgs;
    protected Filter filter;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    protected final String f33277id;
    protected ClassLoader loader;
    protected final String resource;

    public LocalizedMessage(String str, String str2, String str3, Object[] objArr) throws UnsupportedEncodingException, NullPointerException {
        this.encoding = DEFAULT_ENCODING;
        this.extraArgs = null;
        this.filter = null;
        this.loader = null;
        if (str == null || str2 == null || objArr == null) {
            throw null;
        }
        this.f33277id = str2;
        this.resource = str;
        this.arguments = new FilteredArguments(objArr);
        if (!Charset.isSupported(str3)) {
            throw new UnsupportedEncodingException(a0.p("The encoding \"", str3, "\" is not supported."));
        }
        this.encoding = str3;
    }

    public String addExtraArgs(String str, Locale locale) {
        if (this.extraArgs == null) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer(str);
        Object[] filteredArgs = this.extraArgs.getFilteredArgs(locale);
        for (Object obj : filteredArgs) {
            stringBuffer.append(obj);
        }
        return stringBuffer.toString();
    }

    public String formatWithTimeZone(String str, Object[] objArr, Locale locale, TimeZone timeZone) {
        MessageFormat messageFormat = new MessageFormat(" ");
        messageFormat.setLocale(locale);
        messageFormat.applyPattern(str);
        if (!timeZone.equals(TimeZone.getDefault())) {
            Format[] formats = messageFormat.getFormats();
            for (int i11 = 0; i11 < formats.length; i11++) {
                Format format = formats[i11];
                if (format instanceof DateFormat) {
                    DateFormat dateFormat = (DateFormat) format;
                    dateFormat.setTimeZone(timeZone);
                    messageFormat.setFormat(i11, dateFormat);
                }
            }
        }
        return messageFormat.format(objArr);
    }

    public Object[] getArguments() {
        return this.arguments.getArguments();
    }

    public ClassLoader getClassLoader() {
        return this.loader;
    }

    public String getEntry(String str, Locale locale, TimeZone timeZone) throws MissingEntryException {
        String strM = this.f33277id;
        if (str != null) {
            strM = k.m(strM, ".", str);
        }
        String str2 = strM;
        try {
            ClassLoader classLoader = this.loader;
            String str3 = this.resource;
            String string = (classLoader == null ? ResourceBundle.getBundle(str3, locale) : ResourceBundle.getBundle(str3, locale, classLoader)).getString(str2);
            if (!this.encoding.equals(DEFAULT_ENCODING)) {
                string = new String(string.getBytes(DEFAULT_ENCODING), this.encoding);
            }
            if (!this.arguments.isEmpty()) {
                string = formatWithTimeZone(string, this.arguments.getFilteredArgs(locale), locale, timeZone);
            }
            return addExtraArgs(string, locale);
        } catch (UnsupportedEncodingException e5) {
            a.m(e5);
            return null;
        } catch (MissingResourceException unused) {
            String strP = k.p(f.s("Can't find entry ", str2, " in resource file "), this.resource, ".");
            String str4 = this.resource;
            ClassLoader classLoader2 = this.loader;
            if (classLoader2 == null) {
                classLoader2 = getClassLoader();
            }
            throw new MissingEntryException(strP, str4, str2, locale, classLoader2);
        }
    }

    public Object[] getExtraArgs() {
        FilteredArguments filteredArguments = this.extraArgs;
        if (filteredArguments == null) {
            return null;
        }
        return filteredArguments.getArguments();
    }

    public Filter getFilter() {
        return this.filter;
    }

    public String getId() {
        return this.f33277id;
    }

    public String getResource() {
        return this.resource;
    }

    public void setClassLoader(ClassLoader classLoader) {
        this.loader = classLoader;
    }

    public void setExtraArgument(Object obj) {
        setExtraArguments(new Object[]{obj});
    }

    public void setExtraArguments(Object[] objArr) {
        if (objArr == null) {
            this.extraArgs = null;
            return;
        }
        FilteredArguments filteredArguments = new FilteredArguments(objArr);
        this.extraArgs = filteredArguments;
        filteredArguments.setFilter(this.filter);
    }

    public void setFilter(Filter filter) {
        this.arguments.setFilter(filter);
        FilteredArguments filteredArguments = this.extraArgs;
        if (filteredArguments != null) {
            filteredArguments.setFilter(filter);
        }
        this.filter = filter;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Resource: \"");
        stringBuffer.append(this.resource);
        stringBuffer.append("\" Id: \"");
        stringBuffer.append(this.f33277id);
        stringBuffer.append("\" Arguments: ");
        stringBuffer.append(this.arguments.getArguments().length);
        stringBuffer.append(" normal");
        FilteredArguments filteredArguments = this.extraArgs;
        if (filteredArguments != null && filteredArguments.getArguments().length > 0) {
            stringBuffer.append(", ");
            stringBuffer.append(this.extraArgs.getArguments().length);
            stringBuffer.append(" extra");
        }
        stringBuffer.append(" Encoding: ");
        stringBuffer.append(this.encoding);
        stringBuffer.append(" ClassLoader: ");
        stringBuffer.append(this.loader);
        return stringBuffer.toString();
    }

    public LocalizedMessage(String str, String str2, String str3) throws UnsupportedEncodingException, NullPointerException {
        this.encoding = DEFAULT_ENCODING;
        this.extraArgs = null;
        this.filter = null;
        this.loader = null;
        if (str == null || str2 == null) {
            throw null;
        }
        this.f33277id = str2;
        this.resource = str;
        this.arguments = new FilteredArguments();
        if (!Charset.isSupported(str3)) {
            throw new UnsupportedEncodingException(a0.p("The encoding \"", str3, "\" is not supported."));
        }
        this.encoding = str3;
    }

    public LocalizedMessage(String str, String str2) throws NullPointerException {
        this.encoding = DEFAULT_ENCODING;
        this.extraArgs = null;
        this.filter = null;
        this.loader = null;
        if (str == null || str2 == null) {
            throw null;
        }
        this.f33277id = str2;
        this.resource = str;
        this.arguments = new FilteredArguments();
    }

    public LocalizedMessage(String str, String str2, Object[] objArr) throws NullPointerException {
        this.encoding = DEFAULT_ENCODING;
        this.extraArgs = null;
        this.filter = null;
        this.loader = null;
        if (str == null || str2 == null || objArr == null) {
            throw null;
        }
        this.f33277id = str2;
        this.resource = str;
        this.arguments = new FilteredArguments(objArr);
    }

    public static class FilteredArguments {
        protected static final int FILTER = 1;
        protected static final int FILTER_URL = 2;
        protected static final int NO_FILTER = 0;
        protected int[] argFilterType;
        protected Object[] arguments;
        protected Filter filter;
        protected Object[] filteredArgs;
        protected boolean[] isLocaleSpecific;
        protected Object[] unpackedArgs;

        public FilteredArguments(Object[] objArr) {
            this.filter = null;
            this.arguments = objArr;
            this.unpackedArgs = new Object[objArr.length];
            this.filteredArgs = new Object[objArr.length];
            this.isLocaleSpecific = new boolean[objArr.length];
            this.argFilterType = new int[objArr.length];
            for (int i11 = 0; i11 < objArr.length; i11++) {
                Object obj = objArr[i11];
                if (obj instanceof TrustedInput) {
                    this.unpackedArgs[i11] = ((TrustedInput) obj).getInput();
                    this.argFilterType[i11] = 0;
                } else {
                    boolean z11 = obj instanceof UntrustedInput;
                    Object[] objArr2 = this.unpackedArgs;
                    if (z11) {
                        objArr2[i11] = ((UntrustedInput) obj).getInput();
                        boolean z12 = objArr[i11] instanceof UntrustedUrlInput;
                        int[] iArr = this.argFilterType;
                        if (z12) {
                            iArr[i11] = 2;
                        } else {
                            iArr[i11] = 1;
                        }
                    } else {
                        objArr2[i11] = obj;
                        this.argFilterType[i11] = 1;
                    }
                }
                this.isLocaleSpecific[i11] = this.unpackedArgs[i11] instanceof LocaleString;
            }
        }

        private Object filter(int i11, Object obj) {
            Filter filter = this.filter;
            if (filter != null) {
                if (obj == null) {
                    obj = Address.ADDRESS_NULL_PLACEHOLDER;
                }
                if (i11 != 0) {
                    if (i11 == 1) {
                        return filter.doFilter(obj.toString());
                    }
                    if (i11 != 2) {
                        return null;
                    }
                    return filter.doFilterUrl(obj.toString());
                }
            }
            return obj;
        }

        public Object[] getArguments() {
            return this.arguments;
        }

        public Filter getFilter() {
            return this.filter;
        }

        public Object[] getFilteredArgs(Locale locale) {
            Object[] objArr = new Object[this.unpackedArgs.length];
            int i11 = 0;
            while (true) {
                Object[] objArr2 = this.unpackedArgs;
                if (i11 >= objArr2.length) {
                    return objArr;
                }
                Object objFilter = this.filteredArgs[i11];
                if (objFilter == null) {
                    Object obj = objArr2[i11];
                    if (this.isLocaleSpecific[i11]) {
                        objFilter = filter(this.argFilterType[i11], ((LocaleString) obj).getLocaleString(locale));
                    } else {
                        objFilter = filter(this.argFilterType[i11], obj);
                        this.filteredArgs[i11] = objFilter;
                    }
                }
                objArr[i11] = objFilter;
                i11++;
            }
        }

        public boolean isEmpty() {
            return this.unpackedArgs.length == 0;
        }

        public void setFilter(Filter filter) {
            if (filter != this.filter) {
                for (int i11 = 0; i11 < this.unpackedArgs.length; i11++) {
                    this.filteredArgs[i11] = null;
                }
            }
            this.filter = filter;
        }

        public FilteredArguments() {
            this(new Object[0]);
        }
    }
}
