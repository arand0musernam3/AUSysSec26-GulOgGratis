package a40;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f726a;

    public /* synthetic */ h(int i11) {
        this.f726a = i11;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f726a) {
            case 0:
                return str.startsWith("aqs.");
            case 1:
                return str.startsWith(".ae");
            case 2:
                return str.startsWith("event");
            case 3:
                return str.startsWith("event") && !str.endsWith("_");
            case 4:
                return Pattern.matches("cpu[0-9]+", str);
            case 5:
                str.getClass();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                return new Regex(String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3))).e(str);
            case 6:
                str.getClass();
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                return new Regex(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"anr_log_"}, 1))).e(str);
            case 7:
                str.getClass();
                StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                return new Regex(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"analysis_log_"}, 1))).e(str);
            default:
                str.getClass();
                StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                return new Regex(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"error_log_"}, 1))).e(str);
        }
    }
}
