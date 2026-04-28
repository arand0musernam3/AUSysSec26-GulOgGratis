package cw;

import com.braze.managers.g;
import com.braze.managers.h0;
import com.braze.managers.v0;
import com.braze.models.outgoing.e;
import com.braze.storage.SdkMetadataDataStoreProvider$Companion;
import com.braze.triggers.managers.f;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f13455b;

    public /* synthetic */ a(List list, int i11) {
        this.f13454a = i11;
        this.f13455b = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f13454a) {
            case 0:
                return e.a(this.f13455b);
            case 1:
                Object obj = this.f13455b.get(2);
                obj.getClass();
                return (Integer) obj;
            case 2:
                return ((KType) this.f13455b.get(0)).getClassifier();
            case 3:
                return ((KType) this.f13455b.get(0)).getClassifier();
            case 4:
                return SdkMetadataDataStoreProvider$Companion.migrateMetadataToJson$lambda$4$lambda$3(this.f13455b);
            case 5:
                return Integer.valueOf(this.f13455b.size());
            case 6:
                return this.f13455b;
            case 7:
                return f.b(this.f13455b);
            case 8:
                return f.c(this.f13455b);
            case 9:
                return g.b(this.f13455b);
            case 10:
                return h0.a(this.f13455b);
            default:
                return v0.a(this.f13455b);
        }
    }
}
