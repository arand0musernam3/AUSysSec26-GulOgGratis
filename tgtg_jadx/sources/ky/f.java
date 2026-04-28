package ky;

import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.media.RingtoneManager;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j30.g f26703b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(j30.g gVar, int i11) {
        super(0);
        this.f26702a = i11;
        this.f26703b = gVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f26702a) {
            case 0:
                AssetManager assetManager = (AssetManager) this.f26703b.f24503c;
                assetManager.getClass();
                String[] locales = assetManager.getLocales();
                locales.getClass();
                ArrayList arrayList = new ArrayList(locales.length);
                for (String str : locales) {
                    arrayList.add(String.valueOf(str));
                }
                return (String[]) arrayList.toArray(new String[0]);
            case 1:
                Configuration configuration = (Configuration) this.f26703b.f24504d;
                configuration.getClass();
                Locale locale = configuration.locale;
                locale.getClass();
                String country = locale.getCountry();
                country.getClass();
                return country;
            default:
                RingtoneManager ringtoneManager = (RingtoneManager) this.f26703b.f24502b;
                ringtoneManager.getClass();
                Uri ringtoneUri = ringtoneManager.getRingtoneUri(0);
                ringtoneUri.getClass();
                String string = ringtoneUri.toString();
                string.getClass();
                return string;
        }
    }
}
