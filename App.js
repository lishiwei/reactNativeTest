/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow
 */

import React, {Component} from 'react';
import {Platform, StyleSheet, Text, View} from 'react-native';
import ToastExample from "./ToastExample";
import ActivityManagerModule from "./ActivityManagerModule";

const instructions = Platform.select({
    ios: 'Press Cmd+R to reload,\n' + 'Cmd+D or shake for dev menu',
    android:
        'testtttttt',
});

type Props = {};
export default class App extends Component<Props> {
    render() {
        return (
            <View style={styles.container}>
                <Text style={styles.welcome} onPress={() => {
                    ToastExample.show("Awesome", ToastExample.SHORT);
                    ActivityManagerModule.startActivity("aaaaaa",(params)=>{
                        console.log(params)
                    },
                        ()=>{

                    })
                }}>Welcome to React Native!</Text>
                <Text style={styles.instructions} onPress={()=>{
                    ActivityManagerModule.startActivityPromise("bbbbbb").then((params)=>{console.log(params)})

                }}>To get started, edit App.js</Text>
                <Text style={styles.instructions}>{instructions}</Text>
            </View>
        );
    }
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center',
        backgroundColor: '#F5FCFF',
    },
    welcome: {
        fontSize: 20,
        textAlign: 'center',
        margin: 10,
    },
    instructions: {
        textAlign: 'center',
        color: '#333333',
        marginBottom: 5,
    },
});
