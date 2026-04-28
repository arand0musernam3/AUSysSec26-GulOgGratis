package y00;

import java.util.Calendar;
import java.util.Locale;
import zendesk.messaging.android.internal.conversationscreen.TimeConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends w1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f45058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f45059e;

    @Override // y00.w1
    public final boolean q() {
        Calendar calendar = Calendar.getInstance();
        this.f45058d = ((long) (calendar.get(16) + calendar.get(15))) / TimeConstants.ONE_MINUTE_DIFFERENCE;
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f45059e = e0.f.n(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
        return false;
    }

    public final long t() {
        r();
        return this.f45058d;
    }

    public final String u() {
        r();
        return this.f45059e;
    }
}
