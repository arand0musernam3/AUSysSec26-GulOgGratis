package tl;

import com.braze.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q90.r0;
import ra0.o;
import ra0.s;
import u70.q;
import ul.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Ltl/a;", "", "", "countryCode", "Lul/c;", "body", "Lu70/q;", "Lq90/r0;", Constants.BRAZE_PUSH_CONTENT_KEY, "(Ljava/lang/String;Lul/c;Lx70/c;)Ljava/lang/Object;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @o("/api/charity/v1/interested/{countryCode}")
    @Nullable
    Object a(@s(encoded = true, value = "countryCode") @NotNull String str, @NotNull @ra0.a c cVar, @NotNull x70.c<? super q<? extends r0>> cVar2);
}
