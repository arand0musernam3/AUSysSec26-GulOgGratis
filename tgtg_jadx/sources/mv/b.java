package mv;

import android.content.Context;
import android.content.SharedPreferences;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.Server;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static b f30149d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f30150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f30151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Server f30152c;

    public b(Context context, ft.e eVar) {
        eVar.getClass();
        this.f30150a = context;
        Server.Companion companion = Server.INSTANCE;
        SharedPreferences sharedPreferences = ft.e.f17922c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appDataStorage");
            sharedPreferences = null;
        }
        Server serverFromJson = companion.fromJson(sharedPreferences.getString("currentServer", null));
        if (serverFromJson == null) {
            serverFromJson = new Server((String) null, (String) null, false, false, (Integer) null, 31, (DefaultConstructorMarker) null);
        }
        this.f30152c = serverFromJson;
        f30149d = this;
    }

    public final String a() {
        String string = this.f30150a.getResources().getString(R.string.app_language);
        string.getClass();
        return string;
    }
}
