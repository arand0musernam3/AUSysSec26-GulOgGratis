package androidx.compose.ui.tooling;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.ComponentActivity;
import cg.v0;
import com.braze.h2;
import e.f;
import h80.a;
import java.lang.reflect.Constructor;
import kotlin.text.StringsKt;
import rs.b;
import u3.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class PreviewActivity extends ComponentActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f2256c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2257b = "PreviewActivity";

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        Class<?> cls;
        super.onCreate(bundle);
        int i11 = getApplicationInfo().flags & 2;
        String str = this.f2257b;
        if (i11 == 0) {
            Log.d(str, "Application is not debuggable. Compose Preview not allowed.");
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("composable")) == null) {
            return;
        }
        Log.d(str, "PreviewActivity has composable ".concat(stringExtra));
        String strA0 = StringsKt.a0(stringExtra, '.');
        String strW = StringsKt.W('.', stringExtra, stringExtra);
        String stringExtra2 = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra2 == null) {
            Log.d(str, "Previewing '" + strW + "' without a parameter provider.");
            f.a(this, new d(new v0(strA0, strW, 5), true, -840626948));
            return;
        }
        Log.d(str, "Previewing '" + strW + "' with parameter provider: '" + stringExtra2 + '\'');
        try {
            cls = Class.forName(stringExtra2);
        } catch (ClassNotFoundException e5) {
            Log.e("PreviewLogger", "Unable to find PreviewProvider '" + stringExtra2 + '\'', e5);
            cls = null;
        }
        getIntent().getIntExtra("parameterProviderIndex", -1);
        int i12 = 0;
        if (cls == null) {
            f.a(this, new d(new b(strA0, strW, new Object[0], 16), true, -1901447514));
            return;
        }
        try {
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            Constructor<?> constructor = null;
            boolean z11 = false;
            while (true) {
                if (i12 < length) {
                    Constructor<?> constructor2 = constructors[i12];
                    if (constructor2.getParameterTypes().length == 0) {
                        if (z11) {
                            break;
                        }
                        z11 = true;
                        constructor = constructor2;
                    }
                    i12++;
                } else if (!z11) {
                }
            }
            constructor = null;
            if (constructor == null) {
                throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
            }
            constructor.setAccessible(true);
            constructor.newInstance(null).getClass();
            throw new ClassCastException();
        } catch (a unused) {
            h2.b("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
        }
    }
}
