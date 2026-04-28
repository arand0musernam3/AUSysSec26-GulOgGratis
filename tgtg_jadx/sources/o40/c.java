package o40;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import zendesk.core.android.internal.DateKtxConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements m40.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f31973a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateKtxConstants.ISO_8601_UTC_PATTERN, Locale.US);
        f31973a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(DateKtxConstants.UTC_TIMEZONE));
    }

    @Override // m40.a
    public final void a(Object obj, Object obj2) {
        ((m40.f) obj2).add(f31973a.format((Date) obj));
    }
}
