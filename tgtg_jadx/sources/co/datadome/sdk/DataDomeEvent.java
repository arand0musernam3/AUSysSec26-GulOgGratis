package co.datadome.sdk;

import androidx.annotation.NonNull;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class DataDomeEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8629d = new Date().getTime();

    public DataDomeEvent(int i11, String str, String str2) {
        this.f8626a = i11;
        this.f8627b = str;
        this.f8628c = str2;
    }

    @NonNull
    public String customJsonString() {
        return String.format(Locale.getDefault(), "{\"id\":%d, \"message\":\"%s\", \"source\":\"%s\", \"date\":%d}", Integer.valueOf(this.f8626a), this.f8627b, this.f8628c, Long.valueOf(this.f8629d));
    }
}
