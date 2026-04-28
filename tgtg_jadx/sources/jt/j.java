package jt;

import com.app.tgtg.model.remote.token.RefreshToken;
import com.app.tgtg.model.remote.token.RefreshTokenResult;
import com.braze.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ra0.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Ljt/j;", "", "Lcom/app/tgtg/model/remote/token/RefreshToken;", "refreshToken", "Loa0/d;", "Lcom/app/tgtg/model/remote/token/RefreshTokenResult;", Constants.BRAZE_PUSH_CONTENT_KEY, "(Lcom/app/tgtg/model/remote/token/RefreshToken;)Loa0/d;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface j {
    @o("api/token/v1/refresh")
    @NotNull
    oa0.d<RefreshTokenResult> a(@NotNull @ra0.a RefreshToken refreshToken);
}
