package com.shabinder.common.di

import com.shabinder.common.models.TrackDetails

expect fun openPlatform(packageID:String, platformLink:String)

expect fun shareApp()

expect fun giveDonation()

expect fun downloadTracks(list: List<TrackDetails>)