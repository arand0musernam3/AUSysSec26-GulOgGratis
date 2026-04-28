package ky;

import android.content.ContentResolver;
import android.provider.Settings;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ se.d f26724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f26725c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(se.d dVar, String str, int i11) {
        super(0);
        this.f26723a = i11;
        this.f26724b = dVar;
        this.f26725c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f26723a) {
            case 0:
                ContentResolver contentResolver = (ContentResolver) this.f26724b.f39013b;
                contentResolver.getClass();
                String string = Settings.Global.getString(contentResolver, this.f26725c);
                string.getClass();
                return string;
            case 1:
                ContentResolver contentResolver2 = (ContentResolver) this.f26724b.f39013b;
                contentResolver2.getClass();
                String string2 = Settings.Secure.getString(contentResolver2, this.f26725c);
                string2.getClass();
                return string2;
            default:
                ContentResolver contentResolver3 = (ContentResolver) this.f26724b.f39013b;
                contentResolver3.getClass();
                String string3 = Settings.System.getString(contentResolver3, this.f26725c);
                string3.getClass();
                return string3;
        }
    }
}
