package androidx.credentials.exceptions.publickeycredential;

import kotlin.Metadata;
import o7.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialDomException;", "Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialException;", "nx/d", "credentials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetPublicKeyCredentialDomException extends GetPublicKeyCredentialException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f2805c = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    public GetPublicKeyCredentialDomException(a aVar, String str) {
        String strConcat = "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/".concat(aVar.f32040a);
        super(str, strConcat);
        if (strConcat.length() > 0) {
            return;
        }
        i4.a.f("type must not be empty");
        throw null;
    }
}
