package com.adyen.threeds2;

import android.app.Activity;
import com.adyen.threeds2.exception.InvalidInputException;
import com.adyen.threeds2.parameters.ChallengeParameters;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public interface Transaction {
    void close();

    void doChallenge(Activity activity, ChallengeParameters challengeParameters, ChallengeStatusHandler challengeStatusHandler, int i11) throws InvalidInputException;

    @d
    void doChallenge(Activity activity, ChallengeParameters challengeParameters, ChallengeStatusReceiver challengeStatusReceiver, int i11) throws InvalidInputException;

    AuthenticationRequestParameters getAuthenticationRequestParameters();

    ProgressDialog getProgressView(Activity activity) throws InvalidInputException;
}
