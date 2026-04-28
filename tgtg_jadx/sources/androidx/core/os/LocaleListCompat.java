package androidx.core.os;

import android.os.LocaleList;
import d7.f;
import java.util.Locale;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class LocaleListCompat {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LocaleListCompat f2729b = a(new Locale[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f2730a;

    public LocaleListCompat(f fVar) {
        this.f2730a = fVar;
    }

    public static LocaleListCompat a(Locale... localeArr) {
        return i(new LocaleList(localeArr));
    }

    public static LocaleListCompat b(String str) {
        if (str == null || str.isEmpty()) {
            return d();
        }
        String[] strArrSplit = str.split(MessageLogView.COMMA_SEPARATOR, -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i11 = 0; i11 < length; i11++) {
            localeArr[i11] = Locale.forLanguageTag(strArrSplit[i11]);
        }
        return a(localeArr);
    }

    public static LocaleListCompat d() {
        return f2729b;
    }

    public static LocaleListCompat i(LocaleList localeList) {
        return new LocaleListCompat(new f(localeList));
    }

    public Locale c(int i11) {
        return this.f2730a.f14566a.get(i11);
    }

    public boolean e() {
        return this.f2730a.f14566a.isEmpty();
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocaleListCompat) {
            return this.f2730a.equals(((LocaleListCompat) obj).f2730a);
        }
        return false;
    }

    public int f() {
        return this.f2730a.f14566a.size();
    }

    public String g() {
        return this.f2730a.f14566a.toLanguageTags();
    }

    public Object h() {
        return this.f2730a.f14566a;
    }

    public int hashCode() {
        return this.f2730a.f14566a.hashCode();
    }

    public String toString() {
        return this.f2730a.f14566a.toString();
    }
}
